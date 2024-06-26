import http from '../utils/request'
 
//LAC 41
// 请求首页数据
export const getData = () => {
    // 返回一个promise对象
    return http.get('/home/getData')
}
 
export const getUser = (params) => {
    console.log(params, 'params')
    // 返回用户列表
    return http.get('/radiodata/loadPage', params)
}
 
export const addUser = (data) => {
    return http.post('/radiodata/save', data)
}
 
export const editUser = (data) => {
    return http.post('/radiodata/save', data)
}
 
export const delUser = (id) => {
    console.log("ddddd")
    return http.get('/radiodata/remove/'+ id)
}
 
export const getMenu = (data) => {
    return http.post('/permission/getMenu', data)
}

export const testR = (data) => {
    return http.get('/member/get/1')
}
<<<<<<< HEAD


//40
export const getUsermu40 = (params) => {
    console.log(params, 'params')
    // 返回用户列表
    return http.get('/radiodata_fourty/loadPage', params)
}
 
export const addUsermu40 = (data) => {
    return http.post('/radiodata_fourty/save', data)
}
 
export const editUsermu40 = (data) => {
    return http.post('/radiodata_fourty/save', data)
}
 
export const delUsermu40 = (id) => {
    console.log("ddddd")
    return http.get('/radiodata_fourty/remove/'+ id)
}
 
export const getMenumu40 = (data) => {
    return http.post('/permission/getMenu', data)
}


//48
export const getUsermu48 = (params) => {
    console.log(params, 'params')
    // 返回用户列表
    return http.get('/radiodata_foureight/loadPage', params)
}
 
export const addUsermu48 = (data) => {
    return http.post('/radiodata_foureight/save', data)
}
 
export const editUsermu48 = (data) => {
    return http.post('/radiodata_foureight/save', data)
}
 
export const delUsermu48 = (id) => {
    console.log("ddddd")
    return http.get('/radiodata_foureight/remove/'+ id)
}
 
export const getMenumu48 = (data) => {
    return http.post('/permission/getMenu', data)
}


//mu41
export const getUsermu41 = (params) => {
    console.log(params, 'params')
    // 返回用户列表
    return http.get('/radiodata_fourone/loadPage', params)
}
 
export const addUsermu41 = (data) => {
    return http.post('/radiodata_fourone/save', data)
}
 
export const editUsermu41 = (data) => {
    return http.post('/radiodata_fourone/save', data)
}
 
export const delUsermu41 = (id) => {
    console.log("ddddd")
    return http.get('/radiodata_fourone/remove/'+ id)
}
 
export const getMenumu41 = (data) => {
    return http.post('/permission/getMenu', data)
}
=======
>>>>>>> d4ce27fb2171dde8094328a6a597cc1876e877fa
