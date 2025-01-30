const path = require("path");
const gmail = require("gmail-tester");

(async () => {
    const email = await gmail.check_inbox(
        path.resolve(__dirname, "credentials.json"),
        path.resolve(__dirname, "gmail_token.json"),
        {
            subject: "Welcome to Confluence 👋", //Replace the subject, emojis are supported.
            from: "info@e.atlassian.com", //Replace with sender
            to: "contact@yusufasik.com", //Replace with yours
            wait_time_sec: 10,
            max_wait_time_sec: 30,
            include_body: true
        }
    );
    if (email) {
        console.log("Email was found!");
    } else {
        console.log("Email was not found!");
    }
})();
