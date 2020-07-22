import request from '@/utils/request'

export function getPopulation(params) {
  return request({
    url: '/table/list',
    method: 'get',
    params
  })
}
