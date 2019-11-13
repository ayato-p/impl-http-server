build: test
	CGO_ENABLED=0	GOOS=linux GOARCH=amd64 go build -o ./bin/http-server -a -tags netgo -installsuffix netgo

test:
	go test	./...

run:
	go run main.go
