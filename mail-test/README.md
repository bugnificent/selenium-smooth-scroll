# Gmail Tester with Google API & OAuth (Node.js)

This project uses `gmail-tester` with Google API and OAuth to check the inbox for specific emails using **Node.js**.

## 📌 Features
- Connects to Gmail using Google API & OAuth.
- Searches for emails matching specific criteria (subject, sender, recipient).
- Waits for emails to arrive within a specified time frame.
- Prints results in the terminal.

## 🚀 Installation

### 1️⃣ Clone the repository
```sh
git clone https://github.com/velespitt/test-automation
cd test-automation/mail-test
```

### 2️⃣ Install dependencies
```sh
npm install gmail-tester
```

### 3️⃣ Set up Google API credentials
You need **credentials.json** and **gmail_token.json** for authentication.

- Follow [this guide](https://developers.google.com/gmail/api/quickstart/nodejs) to generate your **credentials.json**.
- Run authentication to generate **gmail_token.json**:
  ```sh
  node gmail-tester/init.js
  ```

## 📝 Usage

### Run the script to check inbox
```sh
node mail-test.js
```
## 🔧 Troubleshooting
- **Error: Invalid Credentials?** Ensure `credentials.json` and `gmail_token.json` are correctly set up.
- **Email not found?** Check if the email exists and matches the filters.
- **Permission issues?** Enable Gmail API in your Google Cloud Console.

## 🤝 Contributing
Contributions are welcome! If you'd like to improve this project:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a pull request.

## 📜 License
This project is licensed under the MIT License.

---
✅ Happy Coding!
