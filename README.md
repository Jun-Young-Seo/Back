# 다우기술 산학 프로젝트
###  효과적인 광고를 위한 광고문구 자동생성 + 이미지 생성 솔루션


## 🔔 프로젝트 소개

문자 메시지를 활용한 광고는 주로 텍스트로만 구성되어 있어 가독성이 떨어지고 광고 효과가 제한적이다. 하지만 이미지를 삽입하면 사용자의 시선을 끌고, 텍스트의 전달력도 높일 수 있다.

이 프로젝트는 사용자가 키워드, 타겟, 제품, 홍보 분위기 등을 입력하면 최적화된 광고 문구를 생성하도록 설계되었다. 또한, 사용자가 선택한 샘플 이미지를 기반으로 이미지를 생성해 정확도를 높이고, 이미지 생성 시간을 크게 단축했다. 


광고문구 제작에는 OpenAI API - Chat GPT 4o-mini 모델이 사용되었다. 또, 광고 메시지 내 키워드 추출, 이미지 생성 프롬프트 제작, Negative Prompt 선정 등에도 활용되었다.

이미지 생성에는 StableDiffusion Image to Image Realtime API를 사용했다.

마지막으로 문자 전송에는 다우기술의 PPURIO API를 이용했다.


## 👀 작동화면 보기
시현 영상 Youtube : [https://youtu.be/xqzVTz0mM-Q](https://www.youtube.com/watch?v=0KbuAUvdJpM)

최종 발표 자료 및 정리 : [Project_Result.pdf](https://github.com/user-attachments/files/18051505/Project_Result.pdf)



 ## ⚙️ 개발 환경
- **IDE** : IntelliJ Ultimate
- **Programming Language**: Java
- **Using Library** : Spring Boot
- **External APIs** : Stable Diffusion Image to Image Realtime, Open AI API Chat GPT 4o-mini, PPURIO API
- **Deployment** : AWS EC2, RDS, S3 -- by Docker, Dockerhub
<br>


## 👩🏿‍🤝‍👩🏿 Contributors
 - [김진호](https://github.com/1971240) : 팀장, FE
 - [이승언](https://github.com/unvictory2) : FE, Prompt Engineering
 - [신동현](https://github.com/whikih34) : FE
 - [서준영](https://github.com/Jun-Young-Seo) : BE, Deploy, Prompt Engineering


## 🎨
![Poster](https://github.com/user-attachments/assets/2fa3683c-9708-4b5f-a3c8-932daff4a44b)
