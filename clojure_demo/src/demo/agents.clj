(ns demo.agents)

(defn agents
      []
      (def amount (agent 100))
      (println @amount)

      (send amount inc)
      (println @amount)
      (println "some time must pass")
      (println @amount )

      (send amount inc)
      (await-for 2000 amount)
      (println @amount)
      )

(agents)