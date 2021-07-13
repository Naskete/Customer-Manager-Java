# Customer Manage

## 登录

### METHOD:POST
### URL: 121.199.32.101:8085/api/login

```json
{
  "username": "admin",
  "password": "123123"
}
```

## 登记入住

### Method: POST
### URL : 121.199.32.101/api/CheckIn

```json
{
  "roomID": 1001,
  "id": 101010100101,
  "name": "xxx"
}
```

### return
```json
{
  "message": "登记成功"
}
```

## 客房名单

### 单人间名单

### METHOD: GET
### URL: 121.199.32.101/api/single

### return
```json
[
  {
    "roomId": 0,
    "type": "单人间",
    "status": "已入住"
  },
  {
    "roomId": 1,
    "type": "单人间",
    "status": "未入住"
  }
]
```

### 双人间名单

### URL: 121.199.32.101/api/twin
### METHOD: GET

### return

```json
[
  {
    "roomId": 0,
    "type": "双人间",
    "status": "已入住"
  },
  {
    "roomId": 1,
    "type": "双人间",
    "status": "未入住"
  }
]
```

### 客房信息

### Method: GET
### URL: localhost/api/info/room

```json
{
  "roomID": 1
}
```

### return

```json
{
  "roomID": 1,
  "type": "单人间",
  "count": 0
}
```

### 增加房间
### METHOD:POST
### URL:121.199.32.101:8085/api/addRoom
```json
{
  "roomID": 1223,
  "type": 0
}
```
注：0表示单人间，1表示双人间

### 删除房间

### METHOD: GET
### URL:121.199.32.101:8085/api/deleteRoom

```json
{
  "roomID": 123
}
```

### return
```json
{
  "message": "删除成功"
}
```
### 更改房间状态

* 入住和退房时完成房间状态的变更

## 信息统计

### 旅客信息

### METHOD:GET
### URL: 121.199.32.101:8085/api/info/customer

```json
{
  "id": 1010101
}
```

### return
```json
  {
    "id": 1010101,
    "name": "xxx",
    "count": 10,
    "record": [
      {
        "roomID": 1,
        "date": "yyyyMM"
      },
      {
        "roomID": 1,
        "date": "yyyyMM"
      }
    ]
  }
```

### 删除记录

### METHOD: POST
### URL:121.199.32.101:8085/api/info/customer/delete

### return
```json
{
  "message": "删除成功"
}
```

### 计算价格

### METHOD:POST
### URL:121.199.32.101:8085/api/price


```json
{
  "roomID": 1001,
  "days": 10
}
```

### return
```json
{
  "price": 0.0
}
```
