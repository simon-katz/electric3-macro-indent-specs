(ns hyperfiddle.electric-dom3)

(defmacro div [& body] `(do ~@body))

(defmacro text [& args] `(do ~@args))

(declare ^:dynamic node)

(defmacro props
  ([attributes] `(do ~attributes))
  ([node attributes] `(do ~node ~attributes)))
