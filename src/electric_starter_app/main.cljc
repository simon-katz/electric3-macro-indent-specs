(ns electric-starter-app.main
  (:require
   [acme.frontend.main :as main]
   [hyperfiddle.electric-dom3 :as dom]
   [hyperfiddle.electric3 :as e]))

(e/defn Main [ring-request]
  (e/client
    (binding [dom/node 1234 ; js/document.body
              e/http-request (e/server ring-request)]
; mandatory wrapper div https://github.com/hyperfiddle/electric/issues/74
      (dom/div (dom/props {:style {:display "contents"}})
               (main/Main)))))
