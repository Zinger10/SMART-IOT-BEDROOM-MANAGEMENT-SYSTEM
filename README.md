
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
## Hardware Setup

![hardware 1](https://github.com/Zinger10/SMART-IOT-BEDROOM-MANAGEMENT-SYSTEM/assets/94850477/35cf0ecb-80e5-44b9-928c-f8d58a47dcd8)

![hardware 2](https://github.com/Zinger10/SMART-IOT-BEDROOM-MANAGEMENT-SYSTEM/assets/94850477/b7903a09-49d5-4837-9777-98071676df80)

The one thing that we should take note is the Analog pins of the two sensors, MQ-2 smoke sensor and DHT-11 Temperature and Humidity sensor should be connected to ADC2 pins of ESP2. This is because ESP32 has two ADCs and one of them ADC2 is actively used by the Wi-Fi. Based on the IDF documentation, since the ADC2 module is also used by the Wi-Fi, only one of them could get the pre-emption when using together, which means the adc2_get_raw() may get blocked until Wi-Fi stops, and vice versa.


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

* ALLYA MAISARA 
* FARAH NABIHAH 
* LIEW WEN RUI

