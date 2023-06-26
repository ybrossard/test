# Repository : Test
## URL : https://github.com/ybrossard/test

### Paramétrage de l'utilisateur
git config --global user.name "ybrossard"
git config --global user.email ybrossard@yahoo.fr

### Paramétrage de la branche principale
git config --global init.defaultBranch main

### Vérification des paramètres de config de Git
git config --list

### Clonage du repository
git clone https://github.com/ybrossard/test.git

### Rebase intercatif
git rebase -i HEAD~3

### Syntaxe de base pour l’écriture et la mise en forme
https://docs.github.com/fr/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax