(ns app.core
  (:require [reagent.dom :as r.dom]))

(defn app-root []
  [:div {:style {:margin         0
                 :padding        0
                 :width          "100%"
                 :height         "100%"
                 :display        :flex
                 :flex-direction :column
                 :align-items    :center
                 :justify-self   :center}}
   [:h1 "Does this shit work?"]
   [:p "Good enough for gov't work I guess."]
   [:button "fuckeroni"]])

(defn render [c]
  (r.dom/render c
                (js/document.getElementById "app")))

(defn ^:export init []
  (render [app-root]))
