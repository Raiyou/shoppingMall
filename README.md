# springboot-lei

以電商網站為範例的後端架設練習

## API 文件
___
| HTTP Method |  對應操作  |         URL 路徑         |     說明      |
|:-----------:|:------:|:----------------------:|:-----------:|
|    POST     | Create |       /products        | *商品功能-新增商品  |
|   DELETE    | Delete | /products/{productId}  |  商品功能-刪除商品  |
|     GET     |  Read  | /products/{productId}  | 商品功能-查詢特定商品 |
|     GET     |  Read  |       /products        | 商品功能-查詢全部商品 |
|     PUT     | Update | /products/{productId}  | *商品功能-修改商品  |
|    POST     |  Read  |      /users/login      |  *帳號功能-登入   |
|    POST     | Create |    /users/register     |  *帳號功能-註冊   |
|    POST     | Create | /users/{userId}/orders | *訂單功能-創建訂單  |
|     GET     |  Read  | /users/{userId}/orders | 訂單功能-查詢訂單列表 |

*星號註記的RequestBody範例如下

### 商品功能-新增商品、修改商品
___
|    參數名稱     |   類別   |   說明   |
|:-----------:|:------:|:------:|
| productName | String |  商品名稱  |
|  category   | String |  商品分類  |
|  imageUrl   | String | 商品圖片網址 |
|    price    |  Int   |  商品單價  |
|    stock    |  Int   |  商品庫存  |

    {
      "productName": "Toyota",
      "category": "CAR",
      "imageUrl": "http://xxx.com/123.jpg",
      "price": 1000,
      "stock": 5  
    }

### 帳號功能-登入
___
|    參數名稱     |   類別   |   說明   |
|:-----------:|:------:|:------:|
| email | String |  登入帳號  |
|  password   | String |  登入密碼  |
    {
      "email": "test@xxx.com",
      "password": "Pwd123456"
    }

### 帳號功能-註冊
___
|    參數名稱     |   類別   |  說明  |
|:-----------:|:------:|:----:|
| email | String | 註冊帳號 |
|  password   | String | 註冊密碼 |
|  name   | String |  姓名  |
|    tel    |  String   |  電話  |

    {
      "email": "test@xxx.com",
      "password": "Pwd123456",
      "name": "Alan",
      "tel": "0912345678"
    }

### 商品功能-創建訂單
___
|    參數名稱     |   類別   |    說明    |
|:-----------:|:------:|:--------:|
| buyItemList | Array  | 訂單的每筆項目  |
|  productId   | String | 下訂的商品ID  |
|  quantity   | String | 下訂的商品數量  |

    {
      "buyItemList": [
        {
          "productId": 9,
          "quantity": 1
        },
        {
          "productId": 10,
          "quantity": 2
        }
      ]
    }
