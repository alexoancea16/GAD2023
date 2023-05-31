# GAD2023
Curs Java - GAD2023
Oancea Constantin-Alexandru

# Poiect final

Cerinte tehnice:
- In realizarea proiectului s-a utilizat Java ca limbaj de programare, astfel una dintre cerintele tehnice este existenta unui compilator specific. Recomand rularea programelor folosind aplicatia "IntelliJ IDEA".
- Cerinte de sitem: Windows sau Linux ca sistem de operare.


# Project 1
Cerinta:
  Presupunem că avem un sistem de gestionare al unei librării online. Dorim să permitem utilizatorilor să adauge cărți în coșul de cumpărături și să adauge opțiuni suplimentare la aceste cărți, cum ar fi ambalajul cadou sau livrarea express.

Detalii tehnice:
1. Definim interfața "Book" care conține metodele "getDescription()" și "getPrice()".
2. Implementăm clasele concrete "FictionBook" și "NonFictionBook" care implementează interfața "Book".
3. Definim clasa abstractă "BookDecorator" care extinde clasa "Book" și are o referință către un obiect "Book" de bază. Această clasă abstractă implementează metodele "getDescription()" și "getPrice()" delegând apelurile către obiectul "Book" de bază.
4. Implementăm clasele concrete "GiftWrappingDecorator" și "ExpressDeliveryDecorator" care extind clasa "BookDecorator" și adaugă funcționalități suplimentare.
5. În clasa "Main", creăm obiectele de tip "Book" și adăugăm opțiuni suplimentare folosind clasele "BookDecorator". Apoi, afișăm descrierea cărții și prețul final.

Utilizarea:
1. Interfața "Book" definește două metode: "getDescription()" și "getPrice()", care vor fi implementate de clasele concrete "FictionBook" și "NonFictionBook".
2. Clasa "FictionBook" implementează interfața "Book" și reprezintă o carte de ficțiune. Suprascrie metodele "getDescription()" și "getPrice()" pentru a returna descrierea și prețul cărții de ficțiune.
3. Clasa "NonFictionBook" implementează interfața "Book" și reprezintă o carte non-ficțiune. Suprascrie metodele "getDescription()" și "getPrice()" pentru a returna, de asemenea, descrierea și prețul cărții non-ficțiune.
4. Clasa abstractă "BookDecorator" extinde clasa "Book" și implementează metodele "getDescription()" și "getPrice()". Această clasă are o referință către un obiect "Book" de bază și delegă apelurile către acest obiect.
5. Clasa "GiftWrappingDecorator" extinde clasa "BookDecorator" și adaugă funcționalitatea de ambalare cadou. Suprascrie metodele "getDescription()" și "getPrice()" pentru a adăuga descrierea și prețul ambalajului cadou.
6. Clasa "ExpressDeliveryDecorator" extinde clasa "BookDecorator" și adaugă funcționalitatea de livrare express. Suprascrie metodele "getDescription()" și "getPrice()" pentru a adăuga descrierea și prețul livrării express.
7. Clasa "Main" demonstrează utilizarea Design Pattern-ului Decorator prin crearea și aplicarea decoratoarelor pe obiectul FictionBook.

# Project 2
Cerinta: 
   Doriți să dezvoltați un sistem simplu de gestionare a produselor într-un magazin online. Sistemul trebuie să permită crearea și afișarea produselor din diferite categorii, cum ar fi telefoane, laptopuri și televizoare. Fiecare produs trebuie să aibă o metodă de afișare a informațiilor specifice.
   
Detalii tehnice:
1. Codul prezentat demonstrează utilizarea design pattern-ului Factory Method pentru a crea obiecte de produse într-un mod flexibil și extensibil. Acesta urmează o abordare în care crearea și inițializarea obiectelor este responsabilitatea unei clase specializate numite "ProductFactory".
2. Interfața "Product" definește metoda "display()" care este implementată de clasele concretizate pentru a afișa tipul de produs.
3. Clasele concrete "Phone", "Laptop" și "TV" implementează interfața "Product" și definește metoda "display()" pentru fiecare produs în parte, afișând un mesaj corespunzător.
4. Clasa "ProductFactory" este responsabilă de crearea și returnarea obiectelor de produs pe baza unui parametru type specificat.
5. Metoda "createProduct()" primește un parametru type care indică tipul de produs dorit și returnează obiectul de produs corespunzător. În funcție de valoarea parametrului type, este creat și returnat un obiect corespunzător (în cazul nostru, Phone, Laptop sau TV). Dacă valoarea type nu corespunde niciunui tip de produs valid, metoda returnează null.
6. Clasa "Main": în metoda "main" se utilizează "Factory Pattern" pentru a crea diverse obiecte de produs. Se apelează metoda "createProduct()" a clasei "ProductFactory" pentru a crea obiectele de produs Phone, Laptop și TV, specificând tipul corespunzător. Apoi, se apelează metoda "display()" pentru fiecare obiect de produs pentru a afișa tipul acestuia.

Utilizare:
1. Programul folosește metoda "ProductFactory.createProduct()" pentru a crea obiecte de produse. 
  - Pentru a crea un telefon, utilizează "ProductFactory.createProduct("Phone")"
  - Pentru a crea un laptop, utilizează "ProductFactory.createProduct("Laptop")"
  - Pentru a crea un televizor, utilizează "ProductFactory.createProduct("TV")"
2. Se obține rezultatul în urma creării obiectului de produs și atribuie-l unei variabile de tip "Product".
3. Se afișează informațiile despre produsul creat utilizând metoda display() a obiectului de produs.

Oancea Constantin-Alexandru
Pentru mai multe detalii pot fi contactat la adresa de email: alexandruoancea49@gmail.com
