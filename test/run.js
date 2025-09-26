import http from "k6/http";

export default function () {
  const randomNumber = Math.floor(Math.random() * 10) + 1; // Generate a random number between 1 and 10
  //const response = http.get(`http://52.230.150.87:8888/dolares/${randomNumber}`);
  const response = http.get(`http://localhost:9090/dolares/${randomNumber}`);
}

export const options = {
  vus: 10, // Number of virtual users
  duration: "1m", // Duration of the test
  iterations: 100, // Number of iterations per virtual user
};

