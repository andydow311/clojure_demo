(ns demo.refs
    (:import (com.sun.xml.internal.ws.api.server EndpointReferenceExtensionContributor)))

(defn refffs
      []
      (def amount (ref 100))
      (println @amount)

      (dosync
        (ref-set amount 110)
        )

      (println @amount)

      (dosync
        (alter amount inc)
        )
      (println @amount)

      )

(refffs)