
<a name="readme-top"></a>


<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/github_username/repo_name">
    <img src="https://github.com/Zinger10/SMART-IOT-BEDROOM-MANAGEMENT-SYSTEM/assets/94850477/6761bddc-b8ea-4f66-8017-9383d6a4a58f" alt="Logo" width="80" height="80">
  </a>

<h3 align="center">SMART-IOT-BEDROOM-MANAGEMENT-SYSTEM</h3>

</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#Problem Statement">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>



<!-- PROBLEM STATEMENT -->
## About the project

Nowadays, many individuals forget the fan and light controls and are unaware that when they leave the room, there will be a small fire produced by a short circuit from any electrical devices. This activity will end up resulting in increased power costs at home. So,a solution is proposed by developing a smart IoT bedroom management system which user can control the on and off button for fan and lamp, as well as check the humidity and temperature of the room only from a phone application. As a result, we can ensure our house's safety while simultaneously controlling our power expenditure at home.


<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Built With

* ![Android Studio](https://img.shields.io/badge/android%20studio-346ac1?style=for-the-badge&logo=android%20studio&logoColor=white)
* ![Arduino](https://img.shields.io/badge/-Arduino-00979D?style=for-the-badge&logo=Arduino&logoColor=white)
* ![Espressif](https://img.shields.io/badge/espressif-E7352C.svg?style=for-the-badge&logo=espressif&logoColor=white)
* ![Firebase](https://img.shields.io/badge/firebase-a08021?style=for-the-badge&logo=firebase&logoColor=ffcd34)






<!-- USAGE EXAMPLES -->
## APPLICATION USAGE
Login page

<div align="center">
    <img src="https://github.com/Zinger10/SMART-IOT-BEDROOM-MANAGEMENT-SYSTEM/assets/94850477/e355e73e-9b26-491d-8b19-7cce20db8b14" alt="Login page">
</div>

The login page is created as the security measure for the Smart Bedroom apps to protect their rightful users and their information. The page, containing basic elements such as ‘TextView’, ‘EditText’, ‘ImageView’ and ‘Button’ is directly linked to the Firebase database that contain the ID and Password of the users.


<p align="right">(<a href="#readme-top">back to top</a>)</p>


Main page
<div align="center">
  
![main page](https://github.com/Zinger10/SMART-IOT-BEDROOM-MANAGEMENT-SYSTEM/assets/94850477/4d4439bf-fc44-49d8-bfa6-a73fdc943223)

</div>

The main page, uses the element of ‘TextView’ for the text on the page and ‘Button’ element that shall bring the user to the next page once clicked by using the command ‘Intent’ on the MainActivity.java.


<div align="center">
  
![Values page](https://github.com/Zinger10/SMART-IOT-BEDROOM-MANAGEMENT-SYSTEM/assets/94850477/9efddb5b-1c06-4e24-867f-12ce674a17d6)

</div>

The next page, where all the function is placed, displaying the information such as the existence of the smoke, the humidity and also the temperature of the room that being transmitted by the sensors used along the functional button of ‘ON’ and ‘OFF’ for the fan and the lamp, which for this project, we are using the LED. When one of the buttons clicked, it shall transmit data to the firebase and the ESP32 that controlling the fan and the LED, switching them on or off accordingly to the clicked button by the user.

<!-- ROADMAP -->
## Roadmap

- [ ] Feature 1
- [ ] Feature 2
- [ ] Feature 3
    - [ ] Nested Feature

See the [open issues](https://github.com/github_username/repo_name/issues) for a full list of proposed features (and known issues).

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTACT -->
## Contact

Your Name - [@twitter_handle](https://twitter.com/twitter_handle) - email@email_client.com

Project Link: [https://github.com/github_username/repo_name](https://github.com/github_username/repo_name)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

* []()
* []()
* []()

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/github_username/repo_name.svg?style=for-the-badge
[contributors-url]: https://github.com/github_username/repo_name/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/github_username/repo_name.svg?style=for-the-badge
[forks-url]: https://github.com/github_username/repo_name/network/members
[stars-shield]: https://img.shields.io/github/stars/github_username/repo_name.svg?style=for-the-badge
[stars-url]: https://github.com/github_username/repo_name/stargazers
[issues-shield]: https://img.shields.io/github/issues/github_username/repo_name.svg?style=for-the-badge
[issues-url]: https://github.com/github_username/repo_name/issues
[license-shield]: https://img.shields.io/github/license/github_username/repo_name.svg?style=for-the-badge
[license-url]: https://github.com/github_username/repo_name/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/linkedin_username
[product-screenshot]: images/screenshot.png
[Next.js]: https://img.shields.io/badge/next.js-000000?style=for-the-badge&logo=nextdotjs&logoColor=white
[Next-url]: https://nextjs.org/
[React.js]: https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB
[React-url]: https://reactjs.org/
[Vue.js]: https://img.shields.io/badge/Vue.js-35495E?style=for-the-badge&logo=vuedotjs&logoColor=4FC08D
[Vue-url]: https://vuejs.org/
[Angular.io]: https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white
[Angular-url]: https://angular.io/
[Svelte.dev]: https://img.shields.io/badge/Svelte-4A4A55?style=for-the-badge&logo=svelte&logoColor=FF3E00
[Svelte-url]: https://svelte.dev/
[Laravel.com]: https://img.shields.io/badge/Laravel-FF2D20?style=for-the-badge&logo=laravel&logoColor=white
[Laravel-url]: https://laravel.com
[Bootstrap.com]: https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white
[Bootstrap-url]: https://getbootstrap.com
[JQuery.com]: https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white
[JQuery-url]: https://jquery.com 
