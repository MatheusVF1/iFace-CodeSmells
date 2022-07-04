# CODE SMELLS IDENTIFICADOS:

 1. Duplicated Code 
- Na classe Main.java foi encontrado dupllicação dos mesmo println's responsaveis por printar o menu1 (tendo que ficar mudando nos 2 lugares todas vezes) nas linhas 13/14 e 174/175.
- Na classe Main.java foi encontrado dupllicação dos mesmo println's responsaveis por printar o menu2 (tendo que ficar mudando nos 2 lugares todas vezes) nas linhas 64/64/65 e 160/161/162.
- Na classe Account.java mesmo código em métodos diferentes entre as linhas (85 a 94) e as linhas (152 a 161).


 2. Long Method 
- Na classe Account.java varios metodos possuem muitos if e else, e alguns metodos lidam com muita coisa.

3. Large Class
- Classe Account.java está lidando com muitas coisas de classes diferentes se tornando mais complexo de entender. 

4. Feature Envy
- Na classe Account.java, os metodos pedidosAmizade, printarAmigos possuem utilizam muitos atributos/metodos de uma classe diferente.
