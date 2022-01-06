# prevyo_sentiments

```python
t1 = "Yves déteste se sentir fatigué."
t2 = "Alice s'est bien reveillé ce matin."
t3 = "Emvista fait ressortir le potentiel des données textuelles."
t4 = "Marie déteste les e-mails."
t5 = "Ces dernières années, le développement de l’automatisation et de l’intelligence artificielle a tendu à contribuer à la hausse du chômage sur le marché du travail. En 2014 encore, les consultants Gartner Research avaient prédit que d’ici à 2025 les robots intellectuels occuperaient un tiers de l’ensemble des emplois. Ils avaient également prévu qu’en 2018 plus de trois millions de salariés travailleraient sous la direction d’un système à intelligence artificielle.Ajourd’hui, la situation a changé et l’on s’attend à ce que le développement de l’IA permette d’obtenir un équilibre positif entre emplois perdus et emplois créés. Cette opinion unanime est partagée par les experts du Forum économique mondial, ainsi que ceux des sociétés McKinsey et Accenture. En vérité, l’avenir du marché du travail reste encore bien incertain. Toutefois, de nouvelles qualifications seront nécessaires pour rester compétitifs à l’avenir.Les qualifications indispensables à l’installation de nouveaux robots intelligents sur les lignes de production font souvent défaut dans la plupart des entreprises. Les installations industrielles et les usines manquent de temps et de spécialistes en robotique pour moderniser le processus de production en cours. Leur incapacité à utiliser les dernières technologies robotiques suscite un retard par rapport aux tendances de l’IA. Ils manquent de savoir-faire dans l’intégration et la mise en œuvre des systèmes avancés d’intelligence artificielle. Ainsi, le facteur qui retarde l’automatisation de l’IA est avant-tout la qualification des ouvriers. Plus particulièrement, l’apprentissage machine et le réglage individuel du réseau neuronal exigent des connaissances approfondies de la part des spécialistes qui faciliteront l’utilisation de tous les avantages de l’IA."
input_texts = [t1,t2,t3]#,t4,t5,t6]
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
