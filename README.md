# Hunt

The application is installed on the child's device as well as on the parent's device, in the login view the type of user is chosen.

# Feacture
- Multiple Child clients
- Hidden app icon (stealth mode)
- Real-time location.
- Recording calls: incoming/outgoing.
- SMS: received/sent.
- Environment recording.
- Take pictures.
- Keylogger.
- Phishing social network.
- Notifications received: Whatsapp, Instagram, Messenger.

# Build this project
the application work with the api of firebase with which you will have to create a project in firebase and synchronize the application with such project.
[Firebase API](https://firebase.google.com/)

Enable the following development platforms on firebase:
`Authentication`, `realtime database` and `storage`.

- in authentication/sign-in method enable the `email` access provider

- in firebase real-time database assign the following rules:
```java
{
  "rules": {
    ".read": "auth != null",
      ".write": "auth != null"
  }
}
```

- in firebase storage assign the following rules:
```java
service firebase.storage {
  match /b/{bucket}/o {
    match /{allPaths=**} {
      allow read, write: if request.auth != null;
    }
  }
}
```

- In the `build.gradle` assign the social network package of your preference.
also you will have to recreate the view in xml of the social network
```java
ext {
       PACKAGE_CHECK_SOCIAL = "\"PHISHING-SOCIAL_NETWORK\""
}
```

In the `res/values/string.xml` assign your `APY_KEY_MAPS`

- Get the GOOGLE MAPS API KEY [here](https://developers.google.com/maps/documentation/android-api/signup)
```java
<string name="APY_KEY_MAPS">YOU_API_KEY_MAPS</string>
```

note: it is very important that accept all the necessary permissions for the application to work properly

# Pictures
<img src="https://raw.githubusercontent.com/M1Dr05/IsTheApp/master/art/login.jpeg" width="203" height="360"> <img src="https://raw.githubusercontent.com/M1Dr05/IsTheApp/master/art/maps.jpeg" width="203" height="360"> <img src="https://raw.githubusercontent.com/M1Dr05/IsTheApp/master/art/call.jpeg" width="203" height="360"> <img src="https://raw.githubusercontent.com/M1Dr05/IsTheApp/master/art/sms.jpeg" width="203" height="360"> <img src="https://raw.githubusercontent.com/M1Dr05/IsTheApp/master/art/recording.jpeg" width="203" height="360"> <img src="https://raw.githubusercontent.com/M1Dr05/IsTheApp/master/art/photo.jpeg" width="203" height="360"> <img src="https://raw.githubusercontent.com/M1Dr05/IsTheApp/master/art/keylog.jpeg" width="203" height="360"> <img src="https://raw.githubusercontent.com/M1Dr05/IsTheApp/master/art/notification.jpeg" width="203" height="360"> <img src="https://raw.githubusercontent.com/M1Dr05/IsTheApp/master/art/social.jpeg" width="203" height="360"> <img src="https://raw.githubusercontent.com/M1Dr05/IsTheApp/master/art/setting.jpeg" width="203" height="360"> 

# Disclaimer
The IsTheApp application is intended for legal and educational purposes ONLY. It is a violation of the law to install surveillance software on a mobile phone that you have no right to monitor.

IsTheApp is not responsible if the user does not follow the laws of the country and goes against it. If it is found that the user violates any law or spy in secret, he will be subject to sanctions that govern the legislation of the country.



## Author

👤 **Peter Igogo**

* Github: [@igogoson](https://github.com/igogoson)
* LinkedIn: [@Peter_Wangai](https://www.linkedin.com/in/hugo-bollon-68a2381a4/)

## 🤝 Contributing

Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page](https://github.com/hbollon/portfolio-vuejs/issues).

## Show your support

Give a ⭐️ if this project helped you!
