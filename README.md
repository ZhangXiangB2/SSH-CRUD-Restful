# 專案:SSH-CRUD-Restful

# 使用方式:

本專案採用Spring 4 + SpringMVC + Hibernate 5 使用json的方式進行資料傳送 

測試方式採用[Postman](https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop?hl=zh-TW)<br />
進入Postman畫面後, 將設定如圖<br />
![Alt text](/WebContent/img/postman1.jpg)<br />

並設置好要傳送的url及內容<br />
![Alt text](/WebContent/img/postman2.jpg)<br />
便可以進行傳送

有五個url
uri: /user/create, method:post
uri: /user/update, method:post
uri: /user/delete, method:post
uri: /user/find-by-id, method:post
uri: /user/all, method:post


# 環境:
<pre>
OS: windows 7

Encoding: UTF-8

IDE: Eclipse Neon 2

Server: Tomcat 7.0.73

Database: Oracle XE

Model: Spring 4 + SpringMVC + Hibernate 5

Controller: Servlet 3.0
</pre>
