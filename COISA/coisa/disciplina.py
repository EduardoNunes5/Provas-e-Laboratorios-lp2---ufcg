

class Disciplina:

    def __init__(self, nome):
        self._nome = nome
        self._notas = [0.0, 0.0, 0.0, 0.0]

    def cadastra_horas(self, horas):
        self._horas = horas

    def cadastra_nota(self, nota, valor_nota):
        nota = nota - 1
        if nota > 3 or nota < 0:
            return
        self._notas[nota] = valor_nota

    def aprovado(self):
        if self.__media() >= 7:
            return True

        return False

    def __media(self):
        soma = 0
        for nota in self._notas:
            soma += nota
        return soma / 4.0



    def to_string(self):
        return '{} {} {} {}' .format(self._nome, self._horas, self.__media(), self._notas)