/**
 * 目标1：渲染图书列表
 *  1.1 获取数据
 *  1.2 渲染数据
 */
const creator = '老张'
const tbody = document.querySelector('.list')
function getBooksList() {
    axios({
        url: 'http://hmajax.itheima.net/api/books',
        params: {
            creator
        }
    }).then(result => {
        // console.log(result)
        const bookList = result.data.data
        // console.log(bookList);
        tbody.innerHTML = bookList.map(({ id, bookname, author, publisher }, index) => {
            return `
                <tr>
                    <td>${index + 1}</td>
                    <td>${bookname}</td>
                    <td>${author}</td>
                    <td>${publisher}</td>
                    <td data-id="${id}">
                        <span class="del" data-id="${index}">删除</span>
                        <span class="edit">编辑</span>
                    </td>
                </tr>
            `
        }).join('')
    })
}

getBooksList()

// 新增图书

const modal_add = new bootstrap.Modal(document.querySelector('.add-modal'))
document.querySelector('.add-btn').addEventListener('click', () => {
    // 收集表单数据
    // const obj = document.querySelector('.add-modal')
    // console.log(obj);
    // const bookObj = serialize(document.querySelector('.add-form'), { hash: true, empty: true })
    // console.log(bookObj);
    // const { bookname, author, publisher } = bookObj
    // debugger
    // const { bookname, author, publisher } = data1
    const addForm = document.querySelector('.add-form')
    const { bookname, author, publisher } = serialize(addForm, { hash: true, empty: true })
    axios({
        url: 'http://hmajax.itheima.net/api/books',
        method: 'POST',
        data: {
            bookname,
            author,
            publisher,
            creator
        }
    }).then(result => {
        console.log(result);
        getBooksList()
        addForm.reset()
        modal_add.hide()

    })
})

// 删除功能
tbody.addEventListener('click', function (e) {
    if (e.target.classList.contains('del')) {
        // console.dir(e.target)
        // const id = e.target.dataset.id
        // console.log(id);
        const id = e.target.parentNode.dataset.id
        console.log(id);
        axios({
            url: `http://hmajax.itheima.net/api/books/${id}`,
            method: 'DELETE'
        }).then(result => {
            getBooksList()
        })
    }
})

// 编辑图书
// 页面回显
const editModalDom = document.querySelector('.edit-modal')
const editModal = new bootstrap.Modal(editModalDom)
document.querySelector('.list').addEventListener('click', e => {
    if (e.target.classList.contains('edit')) {
        // 根据图书id查询图书
        axios({
            url: `http://hmajax.itheima.net/api/books/${e.target.parentNode.dataset.id}`
        }).then(result => {
            // console.log(result.data.data);
            const bookObject = result.data.data
            const keys = Object.keys(bookObject)
            keys.forEach(key => {
                document.querySelector(`.edit-form .${key}`).value = bookObject[key]
            })
        })
        editModal.show()
    }
})

// 修改数据
document.querySelector('.edit-btn').addEventListener('click', (e) => {
    // const id = e.target.parentNode.dataset.id
    const form = document.querySelector('.edit-form')
    // const bookObject = serialize(form, { hash:true, empty: true })
    // console.log(bookObject);
    const { id, bookname, author, publisher } = serialize(form, { hash:true, empty: true })
    console.log(bookname,author,publisher);
    axios({
        url: `http://hmajax.itheima.net/api/books/${id}`,
        method: 'PUT',
        data: {
            bookname,
            author,
            publisher,
            creator
        }
    }).then(result => {
        editModal.hide()
        getBooksList()
    })
})