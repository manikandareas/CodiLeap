package com.manikandareas.codileap.core.presentation.util

val kotlinModule = """
  <h1>Pengenalan Kotlin untuk Android Development</h1>

  <div class="alert alert-info">
      <div class="alert-title">Prasyarat Pembelajaran</div>
      <p>Sebelum memulai course ini, pastikan Anda telah memiliki:</p>
      <ul>
          <li>Pemahaman dasar pemrograman</li>
          <li>Android Studio terinstal</li>
          <li>JDK 8 atau lebih tinggi</li>
      </ul>
  </div>

  <h2>1. Apa itu Kotlin?</h2>

  <p>Kotlin adalah bahasa pemrograman modern yang dikembangkan oleh JetBrains dan sekarang menjadi bahasa resmi untuk pengembangan Android.</p>

  <blockquote>
      "Kotlin is my favorite language for Android development." - Sundar Pichai, CEO Google
  </blockquote>

  <h3>Keunggulan Kotlin</h3>

  <ul>
      <li>100% interoperable dengan Java</li>
      <li>Null-safety system</li>
      <li>Concise syntax</li>
      <li>Modern language features</li>
  </ul>

  <h2>2. Basic Syntax</h2>

  <h3>Variables</h3>

  <p>Di Kotlin, kita memiliki dua jenis deklarasi variabel:</p>

  <pre><code class="language-kotlin">
  // Variabel yang bisa diubah (mutable)
  var name = "John"
  name = "Jane" // OK

  // Variabel yang tidak bisa diubah (immutable)
  val age = 25
  // age = 26 // Error!
  </code></pre>

  <div class="alert alert-warning">
      <div class="alert-title">Best Practice</div>
      <p>Selalu gunakan <code>val</code> terlebih dahulu. Ubah ke <code>var</code> hanya jika benar-benar diperlukan.</p>
  </div>

  <h3>Tipe Data Dasar</h3>

  <table>
      <caption>Tipe Data di Kotlin</caption>
      <tr>
          <th>Tipe</th>
          <th>Contoh</th>
          <th>Deskripsi</th>
      </tr>
      <tr>
          <td>Int</td>
          <td>42</td>
          <td>Bilangan bulat 32-bit</td>
      </tr>
      <tr>
          <td>Double</td>
          <td>3.14</td>
          <td>Bilangan desimal 64-bit</td>
      </tr>
      <tr>
          <td>String</td>
          <td>"Hello"</td>
          <td>Teks</td>
      </tr>
      <tr>
          <td>Boolean</td>
          <td>true/false</td>
          <td>Nilai kebenaran</td>
      </tr>
  </table>

  <h3>String Templates</h3>

  <pre><code class="language-kotlin">
  val name = "John"
  val age = 25

  // String template dengan '$'variableName
  println("Hello, '$'name!")

  // String template dengan expression
  println("Next year, you'll be '$'{age + 1} years old")
  </code></pre>

  <h2>3. Control Flow</h2>

  <h3>When Expression</h3>

  <p>Kotlin memiliki <code>when</code> expression yang lebih powerful dibanding <code>switch</code> di Java:</p>

  <pre><code class="language-kotlin">
  val score = 85
  val grade = when {
      score >= 90 -> "A"
      score in 80..89 -> "B"
      score in 70..79 -> "C"
      score in 60..69 -> "D"
      else -> "F"
  }
  </code></pre>

  <div class="interactive quiz" data-question="Apa output dari kode berikut?" data-options="B,A,C,D">
  fun main() {
      val score = 85
      val grade = when {
          score >= 90 -> "A"
          score in 80..89 -> "B"
          score in 70..79 -> "C"
          score in 60..69 -> "D"
          else -> "F"
      }
      println(grade)
  }
  </div>

  <h2>4. Functions</h2>

  <h3>Basic Functions</h3>

  <pre><code class="language-kotlin">
  // Basic function
  fun sayHello(name: String) {
      println("Hello, '$'name!")
  }

  // Function with return value
  fun add(a: Int, b: Int): Int {
      return a + b
  }

  // Single-expression function
  fun multiply(a: Int, b: Int) = a * b
  </code></pre>

  <h2>5. Null Safety</h2>

  <div class="alert alert-error">
      <div class="alert-title">Common Pitfall</div>
      <p>NullPointerException adalah salah satu bug yang paling sering ditemui di Java. Kotlin membantu mencegah ini dengan sistem null-safety.</p>
  </div>

  <pre><code class="language-kotlin">
  // Nullable type
  var nullableName: String? = "John"
  nullableName = null // OK

  // Non-nullable type
  var nonNullName: String = "John"
  // nonNullName = null // Error!

  // Safe call operator
  println(nullableName?.length) // Prints null if nullableName is null

  // Elvis operator
  val len = nullableName?.length ?: 0 // Use 0 if nullableName is null
  </code></pre>

  <h2>6. Collections</h2>

  <img src="https://kotlinlang.org/docs/images/collections-diagram.png" alt="Kotlin Collections Hierarchy" width="800" height="400">
  <figcaption>Hirarki Collections di Kotlin</figcaption>

  <h3>List, Set, dan Map</h3>

  <pre><code class="language-kotlin">
  // Immutable List
  val numbers = listOf(1, 2, 3, 4, 5)

  // Mutable List
  val mutableNumbers = mutableListOf(1, 2, 3)
  mutableNumbers.add(4) // OK

  // Set
  val uniqueNumbers = setOf(1, 2, 2, 3) // Will contain 1, 2, 3

  // Map
  val ages = mapOf(
      "John" to 25,
      "Jane" to 24
  )
  </code></pre>

  <h2>Latihan</h2>

  <div class="interactive fill-blank" data-answer="val">
  Untuk membuat variabel yang tidak bisa diubah di Kotlin, kita menggunakan keyword _____.
  </div>

  <ul class="checklist">
      <li class="unchecked">Pelajari basic syntax</li>
      <li class="unchecked">Latihan membuat functions</li>
      <li class="unchecked">Pahami null safety</li>
      <li class="unchecked">Eksplor collections</li>
  </ul>

  <div class="alert alert-success">
      <div class="alert-title">Next Steps</div>
      <p>Setelah menyelesaikan modul ini, Anda bisa melanjutkan ke materi:</p>
      <ul>
          <li>Object-Oriented Programming in Kotlin</li>
          <li>Kotlin Coroutines</li>
          <li>Android Development with Kotlin</li>
      </ul>
  </div>

  <hr>

  <p class="text-center">Happy learning! 🚀</p>
""".trimIndent()
