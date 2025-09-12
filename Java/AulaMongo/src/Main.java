import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class Main {
    public static void main(String[] args) {
        String uri = "mongodb+srv://nrotta79_db_user:1318192010@cluster0.9a4gh9b.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        try (MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("sample_mflix");

            MongoCollection<Document> collection = database.getCollection("users");


            Document doc = new Document("nome", "João Java")
                    .append("idade", 22)
                    .append("email", "java.joao@gmail.com");


            collection.insertOne(doc);

            System.out.println("Documento inserido com sucesso!");
        }
    }
}
