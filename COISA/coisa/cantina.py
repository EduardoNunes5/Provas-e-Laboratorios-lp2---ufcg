
class ContaCantina:

    def __init__(self, nome_cantina):
        self._nome_cantina = nome_cantina
        self._valor_lanches = []
        self._conta = 0
        self._qntd_lanches = 0

    def cadastra_lanche(self, qntd, cents):
        self._conta += qntd * cents
        self._qntd_lanches += qntd
        self._valor_lanches.append(cents)

    def paga_conta(self, cents):
        if cents > self._conta:
            return

        self._conta -= cents

    def falta_pagar(self):
        return self._conta

    def to_string(self):
        return '{} {} {}' .format(self._nome_cantina, self._qntd_lanches, sum(self._valor_lanches))
