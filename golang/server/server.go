package server

import (
	"net"
	"strconv"
)

func StartServer(host string, port int64) {
	address := host + ":" + strconv.FormatInt(port, 10)
	ln, err := net.Listen("tcp", address)
	if err != nil {
		panic("Uhhhhhhhhhh")
	}

	for {
		conn, err := ln.Accept()
		if err != nil {
			panic("Uhhhhhhhhhh")
		}

		statusLine := string("HTTP/1.1 200 Hello, HTTP Server!!\r\n")
		headers := string("Content-Length: 0\r\n")
		crlf := string("\r\n")
		body := string("")

		responseMessage := []byte(statusLine + headers + crlf + body)
		conn.Write(responseMessage)
		conn.Close()
	}
}
