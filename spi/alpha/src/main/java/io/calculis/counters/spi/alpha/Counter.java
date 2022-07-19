/*
 * Copyright © 2022 JINSPIRED B.V.
 */

package io.calculis.counters.spi.alpha;

import io.humainary.counters.Counters;
import io.humainary.substrates.Substrates.Inlet;
import io.humainary.substrates.sdk.AbstractInstrument;

final class Counter
  extends AbstractInstrument< Long >
  implements Counters.Counter {

  public static final Long ONE = 1L;

  Counter (
    final Inlet< Long > inlet
  ) {

    super (
      inlet
    );

  }


  @Override
  public void inc () {

    inlet.emit (
      ONE
    );

  }

}
