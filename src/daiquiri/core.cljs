(ns daiquiri.core
  (:require [daiquiri.interpreter]
            ; [cljsjs.react]
            ["preact" :as Preact]))

(defn ^js/Preact.Element create-element
  "The React.js create element function."
  [type attrs children]
  (if ^boolean children
    (.apply (Preact/createElement) nil (.concat #js [type attrs] children))
    (Preact/createElement type attrs)))

(def ^js/Preact.Fragment fragment
  "The React.js Fragment."
  (Preact/Fragment))
