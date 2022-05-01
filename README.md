# vktoimgur
Move VK Albums to Imgur

Steps to run :-

1) Get VK_APP_ID, VK_CLIENT_SECRET and VK_REDIRECT_URL by creating an app here: https://vk.com/editapp?act=create
2) Get Authrization code by hitting this url : https://oauth.vk.com/authorize?client_id=<VK_APP_ID>&display=page&redirect_uri=<VK_REDIRECT_URL>&scope=photos&response_type=code&v=5.69
3) Create an Imgur Client here : https://api.imgur.com/oauth2/addclient and get IMGUR_CLIENT_SECRET
4) Add your vk album details in album-config.json
5) Run the maven app and hit http://localhost:8080/imgur/upload

Things to keep in mind :- 
1) VK Album should not contain more than 1000 photos. 
2) Imgur starts rate limiting (both by ip address and client secrets) after 1250 uploads per day. So either try one album at a time, or use a vpn and get multiple IMGUR_CLIENT_SECRET to bypass that. 
