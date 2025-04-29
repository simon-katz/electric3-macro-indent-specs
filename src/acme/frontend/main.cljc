(ns acme.frontend.main
  (:require
   [hyperfiddle.electric-dom3 :as dom]
   [hyperfiddle.electric3 :as e]))

(e/defn Main []
  (e/call (e/fn [x]
            (dom/div (dom/text "Hello " x)))
    "Simon"))
