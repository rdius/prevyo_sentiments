# prevyo_sentiments

Cette exercice à pour but d'analyser des sentiments en utilisant le service Sentiments de Emvista, accessible à partir de l'API https://pss-api.prevyo.com/pss/api/v1/sentiments

Initialement prévu pour être réalisé en Java, nous avons ajouter un cas d'étude en Python pour illustrer notre test.


## Enoncé du test :

Développer un client Java qui se connecte à l’API REST d’Emvista (https://pss.emvista.com/) . En utilisant le service Sentiments envoyer 3 textes différents en parallèle. Pour chacune des réponses, afficher dans la console le résultat sous forme de tableaux :
un tableau contenant la liste des opinions avec pour colonne : *emitter, context, target, value*
un tableau contenant la liste des émotions avec pour colonne : *emitter, trigger, value.*

Prérequis : 
 * Créer un compte sur https://pss.emvista.com/ pour avoir un token.
 * Utiliser la documentation : https://github.com/Emvista/

Rendu :
 * Démonstration
 * Code source sur un repo Github.


### Application Java



---------------------------------------------------------------------------------------------------------------
### Application Python

Le code source est disponible dans le fichier Emvista.ipynb.

---------------------------------------------------------------------------------------------------------------
#### Prérequis : installer requests de Http et Pandas comme indiqué ci-dessous
```python
   * pip install requests
   * pip install pandas   
```

POur tester, il faut appeler la fonction *query_sentiments()* qui prend :
  * input_texts : le texte à analyser
  * api_url : l'url de l'API 
  * token : le token généré
  * language : la langue ('fr' pour le français)

---------------------------------------------------------------------------------------------------------------
#### Exemple 

```python

t1 = "Yves déteste se sentir fatigué."
t2 = "Alice s'est bien reveillé ce matin."
t3 = "Emvista fait ressortir le potentiel des données textuelles."

input_texts = [t1,t2,t3]

input_texts = [t1,t2,t3]

api_url = 'https://pss-api.prevyo.com/pss/api/v1/sentiments'
token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJwc3MiLCJ1c2VyTG9naW4iOiJrYWZhbmRvLnJvZHJpcXVlQGdtYWlsLmNvbSIsInVzZXJJZCI6Mjg5LCJpdGEiOjE2NDEyOTE2NzE2MTgsInJvbGVzIjoiUk9MRV9VU0VSIn0.MmZJdRTWosv2m8R1poiEXWdoedjb7Wh9WkmM9tamDKgn-hYpDWNNQvkHCnv77vqn77QhSKukl8_A86DV1TvS_w"
language = 'fr'

results = query_sentiments(input_texts,api_url,token,language)
```
---------------------------------------------------------------------------------------------------------------
#### Sortie : 

![alt text](./py_out.png)



Processing : Yves déteste se sentir fatigué.

          *****Opinions*****

          emitter   context  target  value
opi_value    Yves  détester  sentir   -1.0 

          *****Emotions*****

          emitter trigger    value
emo_value    Yves  sentir    anger
emo_value    Yves  sentir  disgust
emo_value    Yves  sentir  sadness



Processing : Alice s'est bien reveillé ce matin.

          *****Opinions*****

          emitter context target  value
opi_value            bien   être    1.0 

          *****Emotions*****

          emitter   trigger value
emo_value   Alice  reveillé   joy



Processing : Emvista fait ressortir le potentiel des données textuelles.

          *****Opinions*****

          emitter    context  target  value
opi_value          potentiel  donnée    1.0 

          *****Emotions*****

          emitter    trigger     value
emo_value          potentiel  surprise
