(ns http-server.server
  (:import [java.net ServerSocket Socket])
  (:require [clojure.java.io :as io]))

(defn- make-server-socket [port]
  (ServerSocket. port))

(defn- accept [^ServerSocket s]
  (.accept s))

(defn start [port]
  (with-open [server-socket (make-server-socket port)]
    (with-open [socket (accept server-socket)
                rdr (io/reader (.getInputStream socket))
                writer (io/writer (.getOutputStream socket))]
      (println (first (line-seq rdr)))
      (.write writer "HTTP/1.1 240 Hello\r\n")
      (.write writer "\r\n")

      )))
