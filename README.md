# Sorteio

A URL de acesso fica no contexto `rest/sorteio` e espera um requisição do tipo `POST`.

O body deve estar no seguinte formato:
```
{
	"alunos" : [
	    {
	        "nome": "Gustavo Luszczynski"
	    },
	    {
	        "nome": "Luciano Scorsin"
	    }
	]
}
```

O retorno segue o modelo abaixo:
```
{
	"alunos": [
		{
			"nome": "Gustavo Luszczynski",
			"sorteado": false
		},
		{
			"nome": "Luciano Scorsin",
			"sorteado": true
		}
	]
}
```
