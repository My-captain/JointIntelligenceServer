import axios from '../libs/api.request'

/**
 * 目标列表
 * @returns {*}
 */
export const getAllTarget = () => {
  return axios.request({
    url: 'getAllTarget',
    method: 'post'
  })
}

export const addTarget = obj => {
  return axios.request({
    url: 'addMilitaryTarget',
    method: 'post',
    data: obj
  })
}

export const deleteTarget = uuid => {
  return axios.request({
    url: 'deleteMilitaryTarget',
    method: 'post',
    data: {
      targetId: uuid
    }
  })
}

export const updateTarget = obj => {
  return axios.request({
    url: 'updateMilitaryTarget',
    method: 'post',
    data: obj
  })
}

export const getAllProperty = () => {
  return axios.request({
    url: 'getAllMilitaryProperty',
    method: 'post'
  })
}

export const addProperty = obj => {
  return axios.request({
    url: 'addMilitaryProperty',
    method: 'post',
    data: obj
  })
}

export const updateProperty = obj => {
  return axios.request({
    url: 'updateMilitaryProperty',
    method: 'post',
    data: obj
  })
}

export const deleteProperty = uuid => {
  return axios.request({
    url: 'deleteMilitaryProperty',
    method: 'post',
    data: {
      uuid: uuid
    }
  })
}
