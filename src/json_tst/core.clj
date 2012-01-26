(ns json-tst.core
  (:require 
    [clojure.walk :as walk] [clj-json.core :as cj]
    [clojure.data.json :as dj]))

(def data (slurp "big.json"))

(def roundtrip 1000)


(defn read-data-json []
   (dj/read-json data)nil)


(defn read-clj-json-with-post-walk [] 
 (walk/keywordize-keys  (cj/parse-string data ))
  nil)

(defn read-clj-json [] 
  (cj/parse-string data true)nil)
