class Creator {
  private typeMob: number;
  private mob: Mobs;

  constructor(typeMob: number) {
    this.typeMob = typeMob;
  }

  createMob(typeMob: number): Mobs {
    const MOBS_EXISTS = {
      1: new Harpy(),
      2: new Colossus(),
    };

    return (this.mob = MOBS_EXISTS[typeMob]);
  }
}
