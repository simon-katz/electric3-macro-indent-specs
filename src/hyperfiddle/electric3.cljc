(ns hyperfiddle.electric3
  (:refer-clojure :exclude [fn defn apply letfn for declare])
  #?(:cljs (:require-macros hyperfiddle.electric3)))

(defmacro defn [nm args & body]
  `(clojure.core/defn ~nm ~args ~@body))

(defmacro call [F & args]
  `(~F ~@args))

(defmacro fn [args & body]
  `(clojure.core/fn ~args ~@body))

(defmacro client [& body] `(do ~@body))
(defmacro server [& body] `(do ~@body))

(clojure.core/declare ^:dynamic http-request)
