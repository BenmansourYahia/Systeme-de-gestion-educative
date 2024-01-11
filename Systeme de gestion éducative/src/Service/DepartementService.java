package Service;

import Classes.Departement;
import config.DatabaseConfig;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartementService {

    // Méthode pour ajouter un département
    public static void addDepartement(Departement departement) throws SQLException {
        String query = "INSERT INTO departements (intitule) VALUES (?)";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, departement.getIntitule());
            pstmt.executeUpdate();
        }
    }

    // Méthode pour obtenir tous les départements
    public static List<Departement> getAllDepartements() throws SQLException {
        List<Departement> departements = new ArrayList<>();
        String query = "SELECT * FROM departements";
        try (Connection conn = DatabaseConfig.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Departement departement = new Departement(rs.getString("intitule"));
                // Set other fields if necessary
                departements.add(departement);
            }
        }
        return departements;
    }

    // Méthode pour mettre à jour un département
    public static void updateDepartement(String intitule, Departement newDepartement) throws SQLException {
        String query = "UPDATE departements SET nom = ? WHERE intitule = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, newDepartement.getIntitule());
            pstmt.setString(2, intitule);
            pstmt.executeUpdate();
        }
    }

    // Méthode pour supprimer un département
    public static void deleteDepartement(String intitule) throws SQLException {
        String query = "DELETE FROM departements WHERE intitule = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, intitule);
            pstmt.executeUpdate();
        }
    }

    // Méthode pour obtenir un département par son Intitule
    public static Departement getDepartementByIntitule(String intitule) throws SQLException {
        String query = "SELECT * FROM departements WHERE intitule = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, intitule);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new Departement(rs.getString("intitule"));
                    // Set other fields if necessary
                }
            }
        }
        return null;
    }
}
