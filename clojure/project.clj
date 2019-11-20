(defproject http-server "0.1.0-SNAPSHOT"
  :description "Implementation of HTTP Server"
  :license {:name "The MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :target-path "target/%s"
  :profiles
  {:dev
   {:source-paths ["dev/src"]
    :resource-paths ["dev/resources"]}})
