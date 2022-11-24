<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Barang extends Model
{
    use HasFactory;

    // Not including updated_at and created_at
    public $timestamps = false;
    protected $table = 'barang';

    protected $primaryKey = 'id';

    protected $fillable = [
        'id_akun',
        'nama',
    ];
}
