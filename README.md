# prevyo_sentiments

Cette exercice à pour but d'analyser des sentiments en utilisant le service Sentiments de Emvista, accessible à partir de l'API https://pss-api.prevyo.com/pss/api/v1/sentiments

Il est réaliser en deux langages : Python et Java.


Enoncé du test :

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




### Application Python



```python
t1 = "Yves déteste se sentir fatigué."
t2 = "Alice s'est bien reveillé ce matin."
t3 = "Emvista fait ressortir le potentiel des données textuelles."

input_texts = [t1,t2,t3]
input_texts
['Yves déteste se sentir fatigué.',
 "Alice s'est bien reveillé ce matin.",
 'Emvista fait ressortir le potentiel des données textuelles.']
input_texts = [t1,t2,t3]#,t4,t5,t6]
api_url = 'https://pss-api.prevyo.com/pss/api/v1/sentiments'
token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJwc3MiLCJ1c2VyTG9naW4iOiJrYWZhbmRvLnJvZHJpcXVlQGdtYWlsLmNvbSIsInVzZXJJZCI6Mjg5LCJpdGEiOjE2NDEyOTE2NzE2MTgsInJvbGVzIjoiUk9MRV9VU0VSIn0.MmZJdRTWosv2m8R1poiEXWdoedjb7Wh9WkmM9tamDKgn-hYpDWNNQvkHCnv77vqn77QhSKukl8_A86DV1TvS_w"
language = 'fr'
results = query_sentiments(input_texts,api_url,token,language)
```
