(ns dev
  (:require
   clojure.edn
   electric-starter-app.main
   #?(:clj [shadow.cljs.devtools.api :as shadow])
   #?(:clj [shadow.cljs.devtools.server :as shadow-server])
   #?(:clj [clojure.tools.logging :as log])))

(comment (-main)) ; repl entrypoint

#?(:clj ; server entrypoint
   (do
     (def config
       (merge
        {:host "localhost"
         :port 8081
         :resources-path "public/electric_starter_app"
         :manifest-path ; contains Electric compiled program's version so client and server stays in sync
         "public/electric_starter_app/js/manifest.edn"}))

     (defn -main [& args]
       (log/info "Starting Electric compiler and server...")

       (shadow-server/start!) ; no-op in calva shadow-cljs configuration which starts this out of band
       (shadow/watch :dev)

       (comment (shadow-server/stop!))
       )))
