/**
 * 目标1：信息渲染
 *  1.1 获取用户的数据
 *  1.2 回显数据到标签上
 * */
const creator = '播仔'
axios({
    url: 'http://hmajax.itheima.net/api/settings',
    params: {
        creator
    }
}).then(result => {
    // console.log(result);
    const userObj = result.data.data
    console.log(userObj);
    Object.keys(userObj).forEach(key => {
        if (key === 'avatar') {
            document.querySelector('.prew').src = userObj[key]
        } else if (key === 'gender') {
            const gRadioList = document.querySelectorAll('[name="gender"]')
            gRadioList[userObj[key]].checked = true
        } else {
            document.querySelector(`.content [name=${key}]`).value = userObj[key]
        }
    })
})

// 更换头像
document.querySelector('.upload').addEventListener('change', e => {
    const fd = new FormData()
    fd.append('avatar', e.target.files[0])
    fd.append('creator', creator)
    axios({
        url: 'http://hmajax.itheima.net/api/avatar',
        method: 'PUT',
        data: fd
    }).then(result => {
        console.log(result);
        const img = result.data.data.avatar
        document.querySelector('.prew').src = img
    })
})

// 更改资料
document.querySelector('.submit').addEventListener('click', () => {
    const userForm = document.querySelector('.user-form')
    const userObj = serialize(userForm, { hash:true, empty:true })
    // console.log(userObj)
    userObj.gender = +userObj.gender
    userObj.creator = creator
    console.log(userObj);
    axios({
        url: 'http://hmajax.itheima.net/api/settings',
        method: 'PUT',
        data: userObj
    }).then(result => {
        const toastDom = document.querySelector('.my-toast')
        const toast = new bootstrap.Toast(toastDom)
        toast.show()
    })
})