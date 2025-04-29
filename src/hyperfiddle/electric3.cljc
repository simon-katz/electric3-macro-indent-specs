(ns hyperfiddle.electric3
  (:refer-clojure :exclude [fn defn apply letfn for declare])
  #?(:cljs (:require-macros hyperfiddle.electric3)))

(defmacro defn [nm & fdecl]
  `(clojure.core/defn ~nm ~@fdecl))

(defmacro call [F & args]
  `(~F ~@args))

(defmacro fn [& args]
  `(clojure.core/fn ~@args))

(defmacro client [& body] `(do ~@body))
(defmacro server [& body] `(do ~@body))

(clojure.core/declare ^:dynamic http-request)
