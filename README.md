# 📇 Carte de Visite – Documentation

## 📌 Description

Cette application Android, développée avec **Kotlin** et **Jetpack Compose**, affiche une **carte de visite numérique** contenant :

* Une image/logo
* Le nom et la fonction de la personne
* Les informations de contact (téléphone, email, localisation)

Elle utilise un **thème personnalisé** et un **fond en dégradé** pour un rendu moderne.

---

## ⚙️ Fonctionnalités

* Affichage du **nom** et de la **fonction**
* Présentation d’un **logo/image centrale**
* Informations de contact avec **icônes** (téléphone, email, localisation)
* Design simple et responsive avec **Jetpack Compose**

---

## 📂 Structure principale

* **`MainActivity.kt`** : Point d’entrée de l’application, définit l’écran principal.
* **`BusinessCardScreen`** : Composable affichant la carte de visite.
* **`ContactInfoItem`** : Composable réutilisable pour afficher une ligne d’information (icône + texte).
* **`CarteDeVisiteTheme`** : Gère le style global de l’application.
* **`strings.xml`** : Contient les textes (nom, fonction, numéro, email, localisation).
* **`drawable/win.png`** : Image/logo utilisé dans la carte.

---

## 🚀 Utilisation

1. Lancer l’application sur un appareil ou un émulateur Android.
2. L’écran principal affiche directement la carte de visite.
3. Les informations affichées proviennent de **`strings.xml`**. Tu peux les modifier pour personnaliser la carte.

---

## 🛠️ Personnalisation

* Modifier l’image dans **`drawable/`** (`win.png`).
* Modifier les textes (nom, fonction, etc.) dans **`res/values/strings.xml`**.
* Adapter les couleurs dans le fichier **`CarteDeVisiteTheme.kt`** ou directement dans les composables.



