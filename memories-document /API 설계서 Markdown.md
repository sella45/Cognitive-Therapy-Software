<h1 style='background-color: rgba(55, 55, 55, 0.4); text-align: center'>API 설계(명세)서 </h1>

해당 API 명세서는 '실버케어테크 인지치료 서비스 - Memories'의 REST API를 명세하고 있습니다.

- Domain : http://127.0.0.1:4000  

***
  
<h2 style='background-color: rgba(55, 55, 55, 0.2); text-align: center'>Auth 모듈</h2>

Memories 서비스의 인증 및 인가와 관련된 REST API모듈입니다.
로그인, 회원가입, 아이디 중복 확인 등의 API가 포함되어 있습니다.
Auth 모듈은 인증 없이 요청할 수 있는 모듈입니다.
  
- url : /api/v1/auth

***

#### - ??기능 명??  
  
##### 설명

클라이언트는 사용자 아이디와 평문의 비밀번호를 포함하여 요청하고 아이디와 비밀번화가 일치한다면 인증에 사용될 token과 해당 token의 만료기간을 응답 데이터로 전달받습니다.
만약 아이디 혹은 비밀번호가 하나라도 일치하지 않는다면 로그인 불일치에 해당하는 응답을 받습니다. 서버 에러, 데이터베이스 에러, 유효성 검사 실패 에러가 발생할 수 있습니다. 

- method : **POST**  
- URL : **/Sigin-in**  

##### Request

###### Header

| name | description | required |
|---|:---:|:---:|
| ??필드명?? | ??필드 설명?? | ??필수 여부?? |

###### Request Body

| name | type | description | required |
|---|:---:|:---:|:---:|
| ??필드명?? | ??필드 타입?? | ??필드 설명?? | ??필수 여부?? |

###### Example

```bash
curl -v -X ㅡ??Method?? "??pull url??" \
 -d "??필드명??=값??"
```

##### Response

###### Header

| name | description | required |
|---|:---:|:---:|
| ??필드명?? | ??필드 설명?? | ??필수 여부?? |

###### Response Body

| name | type | description | required |
|---|:---:|:---:|:---:|
| ??필드명?? | ??필드 타입?? | ??필드 설명?? | ??필수 여부?? |

###### Example

**응답 성공**
```bash
HTTP/1.1 ??상태코드?? ??상태메세지??
??필드명??: ??필드값??
{
  "??필드명??": "??필드 값??"
}
```

**응답 : 실패 (??...??)**
```bash
HTTP/1.1 ??상태코드?? ??상태메세지??
??필드명??: ??필드값??
{
  "??필드명??": "??필드 값??"
}
```
