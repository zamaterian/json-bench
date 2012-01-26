(ns json-tst.core
  (:use [criterium.core])
  (:require 
    [clojure.walk :as walk] [clj-json.core :as cj]
    [clojure.data.json :as dj]))

(def data (slurp "big.json"))


(defn read-data-json []
   (dj/read-json data)nil)

(defn read-clj-json-with-post-walk [] 
 (walk/keywordize-keys  (cj/parse-string data ))
  nil)

(defn read-clj-json [] 
  (cj/parse-string data true)nil)

(defn -main [arg]
  (condp = arg
    "data.json" (bench (read-data-json))
    "clj-json"  (bench (read-clj-json))
    "clj-json-post" (bench (read-clj-json-with-post-walk))
   (prn "data.json | clj-json | clj-json-post")) 
  )
