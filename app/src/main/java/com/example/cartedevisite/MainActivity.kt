package com.example.cartedevisite

// Importation des classes nécessaires pour la création de l'interface utilisateur
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartedevisite.ui.theme.CarteDeVisiteTheme
import androidx.compose.ui.graphics.Brush

// Activité principale de l'application
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Définir le contenu de l'activité avec Jetpack Compose
        setContent {
            // Application du thème personnalisé
            CarteDeVisiteTheme {
                // Surface est un conteneur de base avec une couleur de fond
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF1A1F2B) // Couleur de fond personnalisée
                ) {
                    // Affichage de l'écran de la carte de visite avec les données depuis les ressources
                    BusinessCardScreen(
                        name = stringResource(R.string.nom),
                        title = stringResource(R.string.function),
                        phone = stringResource(R.string.number),
                        email = stringResource(R.string.email),
                        location = stringResource(R.string.location)
                    )
                }
            }
        }
    }
}

// Fonction composable principale qui affiche l'écran de la carte de visite int Int
@Composable
fun BusinessCardScreen(
    name: String,
    title: String,
    phone: String,
    email: String,
    location: String
) {
    // Définition d'un dégradé vertical pour l'arrière-plan
    val gradientColors = listOf(Color(0xFF1A1F2B), Color(0xFF232A3B))

    // Colonne principale qui occupe tout l'écran
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(gradientColors)), // Application du dégradé
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        // Partie supérieure contenant l'image, le nom et le titre
        Column(
            modifier = Modifier
                .weight(1f) // Prend autant de place que possible verticalement
                .padding(bottom = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center // Centrage vertical
        ) {
            // Logo Android au centre
            Image(
                painter = painterResource(id = R.drawable.win),
                contentDescription = "Logo Android",
                modifier = Modifier.size(120.dp)
            )
            Spacer(modifier = Modifier.height(8.dp)) // Espace entre l’image et le texte
            // Nom de la personne
            Text(
                text = name,
                color = Color.White,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
            // Fonction ou poste
            Text(
                text = title,
                color = Color(0xFF00C2CB), // Couleur accentuée
                fontSize = 18.sp
            )
        }

        // Partie inférieure contenant les informations de contact
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 130.dp), // Marge en bas pour l'espacement
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            // Colonne contenant chaque ligne d'information de contact
            Column {
                ContactInfoItem(icon = Icons.Default.Phone, text = phone)
                ContactInfoItem(icon = Icons.Default.Email, text = email)
                ContactInfoItem(icon = Icons.Default.Place, text = location)
            }
        }
    }
}

// Fonction composable pour afficher une ligne d'information de contact (icône + texte)
@Composable
fun ContactInfoItem(icon: ImageVector, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 8.dp) // Espacement vertical entre les lignes
    ) {
        // Icône (téléphone, email, lieu)
        Icon(
            imageVector = icon,
            contentDescription = text,
            tint = Color(0xFF00C2CB),
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(16.dp)) // Espace entre l’icône et le texte
        // Texte de l'information de contact
        Text(text = text, color = Color.White, fontSize = 16.sp)
    }
}

// Fonction de prévisualisation pour Android Studio
@Preview(showBackground = true)
@Composable
fun CarteDeVisitePreview() {
    CarteDeVisiteTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFF2E6C8C) // Couleur de fond différente pour la preview
        ) {
            BusinessCardScreen(
                name = stringResource(R.string.nom),
                title = stringResource(R.string.function),
                phone = stringResource(R.string.number),
                email = stringResource(R.string.email),
                location = stringResource(R.string.location)
            )
        }
    }
}
