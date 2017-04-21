# ssm-restful
ssm为基础，采用restful风格，集成spring security，swagger等

## 响应报文格式
格式为:
{
    "meta":{
        "code" : "0",
        "msg" : "",
        "msgs": [],
        "filter" : false
    },
    "data":{
        // 数据
    }
}
说明：
    meta: 消息头.
    code: 为0时表示成功，其他情况都是失败
    msg: 失败时返回的信息
    msgs: 对于可能存在的批量操作返回的错误信息
    filter: 特殊情况用的标识
    data: 数据载体