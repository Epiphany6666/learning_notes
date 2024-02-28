import { checkPhone, checkCode } from "../utils/check.js"
import 'bootstrap/dist/css/bootstrap.min.css'
import './index.css'
console.log(checkPhone('13900002020'))
console.log(checkCode('123123123123'))

// document.querySelector('.btn').addEventListener('click', () => {
//     const phone = document.querySelector('.login-form [name=mobile]').value
//     const code = document.querySelector('.login-form [name=code]').value
//     if (!checkPhone(phone)) {
//         console.log('手机号长度必须是11位')
//         return
//     }

//     if (!checkCode(code)) {
//         console.log('验证码长度必须是6位')
//         return
//     }

//     console.log('提交到服务器登录...')
// })

import './index.less'
import imgObj from '../assets/logo.png'
const theImg = document.createElement('img')
theImg.src = imgObj
document.querySelector('.login-wrap').appendChild(theImg)

import myAxios from '../utils/request.js'
import { myAlert } from '../utils/alert.js'
document.querySelector('.btn').addEventListener('click', () => {
    const phone = document.querySelector('.login-form [name=mobile]').value
    const code = document.querySelector('.login-form [name=code]').value

    if (!checkPhone(phone)) {
        myAlert(false, '手机号长度必须是11位')
        console.log('手机号长度必须是11位')
        return
    }

    if (!checkCode(code)) {
        myAlert(false, '验证码长度必须是6位')
        console.log('验证码长度必须是6位')
        return
    }

    myAxios({
        url: '/v1_0/authorizations',
        method: 'POST',
        data: {
            mobile: phone,
            code
        }
    }).then(res => {
        myAlert(true, '登录成功')
        localStorage.setItem('token', res.data.token)
        // location.href = '../content/index.html'
      }).catch(error => {
        myAlert(false, error.response.data.message)
      })
})