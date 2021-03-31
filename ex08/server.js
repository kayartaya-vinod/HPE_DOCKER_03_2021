const process = require("process");
const express = require("express");
const app = express();
const PORT = process.env.PORT || 3000;

app.get("/", (req, resp) => {
  resp.send("Hello, from Express Web app");
});

// simulate normal shutdown
// if restart policy is "on-failure", container will NOT restart
app.get("/shutdown", function () {
  process.exit(0); // exit code 0 --> normal exit; non-zero --> abnormal exit
});

// simulate an error situation
// if restart policy is "on-failure", container will restart
app.get("/fail", function () {
  process.exit(1); // abnormal termination
});

app.listen(PORT, () => console.log(`server running in port ${PORT}`));
