import axios from "axios";

export const axiosApi = axios.create({
  baseURL: `http://localhost:8080/user`,
  headers: {
    "Access-Control-Allow-Origin": "http://localhost:8080",
  },
});
