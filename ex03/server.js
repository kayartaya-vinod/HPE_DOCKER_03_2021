const process = require("process");
const express = require("express");
const app = express();
const PORT = process.env.PORT || 3000;

app.get("/", (req, resp) => {
  resp.send("<h1>Hello, from Express Web app!!</h1>");
});
app.listen(PORT, () => console.log(`server running in port ${PORT}`));
