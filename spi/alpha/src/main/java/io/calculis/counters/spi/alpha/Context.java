/*
 * Copyright © 2022 JINSPIRED B.V.
 */

package io.calculis.counters.spi.alpha;

import io.humainary.counters.Counters;
import io.humainary.substrates.Substrates.Environment;
import io.humainary.substrates.Substrates.Name;
import io.humainary.substrates.Substrates.Type;
import io.humainary.substrates.sdk.AbstractContext;

import static io.humainary.counters.Counters.Counter.TYPE;

final class Context
  extends AbstractContext< Counters.Counter, Long >
  implements Counters.Context {

  Context (
    final Environment environment,
    final Producer< ? extends Counters.Counter, Long > producer
  ) {

    super (
      environment,
      producer
    );

  }

  @Override
  protected Type type () {

    return
      TYPE;

  }


  @Override
  public Counters.Counter counter (
    final Name name
  ) {

    return
      instrument (
        name
      );

  }
}
